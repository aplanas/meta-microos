SUMMARY = "Build sprintf-like functions of your own"
DESCRIPTION = "String::Formatter is a tool for building sprintf-like formatting routines. \
It supports named or positional formatting, custom conversions, fixed \
string interpolation, and simple width-matching out of the box. It is easy \
to alter its behavior to write new kinds of format string expanders. For \
most cases, it should be easy to build all sorts of formatters out of the \
options built into String::Formatter. \
 \
Normally, String::Formatter will be used to import a sprintf-like routine \
referred to as ''stringf'', but which can be given any name you like. This \
routine acts like sprintf in that it takes a string and some inputs and \
returns a new string: \
 \
  my $output = stringf 'Some %a format %s for you to %u.\\n', { ... }; \
 \
This routine is actually a wrapper around a String::Formatter object \
created by importing stringf. In the following code, the entire hashref \
after 'stringf' is passed to String::Formatter's constructor (the 'new' \
method), save for the '-as' key and any other keys that start with a dash. \
 \
  use String::Formatter \
    stringf => { \
      -as => 'fmt_time', \
      codes           => { ... }, \
      format_hunker   => ..., \
      input_processor => ..., \
    }, \
    stringf => { \
      -as => 'fmt_date', \
      codes           => { ... }, \
      string_replacer => ..., \
      hunk_formatter  => ..., \
    }, \
  ; \
 \
As you can see, this will generate two stringf routines, with different \
behaviors, which are installed with different names. Since the behavior of \
these routines is based on the 'format' method of a String::Formatter \
object, the rest of the documentation will describe the way the object \
behaves. \
 \
There's also a 'named_stringf' export, which behaves just like the \
'stringf' export, but defaults to the 'named_replace' and \
'require_named_input' arguments. There's a 'method_stringf' export, which \
defaults 'method_replace' and 'require_single_input'. Finally, a \
'indexed_stringf', which defaults to 'indexed_replaced' and \
'require_arrayref_input'. For more on these, keep reading, and check out \
the cookbook. \
 \
String::Formatter::Cookbook provides a number of recipes for ways to put \
String::Formatter to use."
LICENSE = "GPL-1.0-or-later"

PV = "1.235"

RPM_NAME = "perl-String-Formatter-1.235-1.4.noarch.rpm"
RPM_HASH = "7816bd66f5d8f1e1df607d9968b43846a6b8e33ba0bdc00d9369ca836d07673e804131dc15413223c3ebff78a8191f42a45227f840deaead9f7ab3a4045112d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Formatter \
perl-String--Formatter--Cookbook \
perl-String-Formatter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Util \
perl-Sub--Exporter"

inherit rpm
