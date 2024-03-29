SUMMARY = "Easily generate and process stateful forms"
DESCRIPTION = "The goal of CGI::FormBuilder (FormBuilder) is to provide an easy \
way for you to generate and process entire CGI form-based \
applications. Its main features are: \
 \
Field Abstraction \
  Viewing fields as entities (instead of just params), where the \
  HTML representation, CGI values, validation, and so on are \
  properties of each field. \
 \
DWIMmery \
  Lots of built-in 'intelligence' (such as automatic field typing), \
  giving you about a 4:1 ratio of the code it generates versus what \
  you have to write. \
 \
Built-in Validation \
  Full-blown regex validation for fields, even including \
  JavaScript code generation. \
 \
Template Support \
 Pluggable support for external template engines, \
  such as HTML::Template, Text::Template, Template Toolkit, \
  and CGI::FastTemplate. \
 \
Plus, the native HTML generated is valid XHTML 1.0 Transitional."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.10"

RPM_NAME = "perl-CGI-FormBuilder-3.10-1.25.noarch.rpm"
RPM_HASH = "5daecca2808d75297210d84902e6556f51c54957b18c9391e13975718f0cc9494aa2ca0609046c95f3155f59cd2dc05c3fb275e9685b1de6b08add05df3728e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--FormBuilder \
perl-CGI--FormBuilder--Field \
perl-CGI--FormBuilder--Field--button \
perl-CGI--FormBuilder--Field--checkbox \
perl-CGI--FormBuilder--Field--date \
perl-CGI--FormBuilder--Field--datetime \
perl-CGI--FormBuilder--Field--datetime-local \
perl-CGI--FormBuilder--Field--email \
perl-CGI--FormBuilder--Field--file \
perl-CGI--FormBuilder--Field--hidden \
perl-CGI--FormBuilder--Field--image \
perl-CGI--FormBuilder--Field--number \
perl-CGI--FormBuilder--Field--password \
perl-CGI--FormBuilder--Field--radio \
perl-CGI--FormBuilder--Field--select \
perl-CGI--FormBuilder--Field--static \
perl-CGI--FormBuilder--Field--submit \
perl-CGI--FormBuilder--Field--text \
perl-CGI--FormBuilder--Field--textarea \
perl-CGI--FormBuilder--Field--time \
perl-CGI--FormBuilder--Field--url \
perl-CGI--FormBuilder--Messages \
perl-CGI--FormBuilder--Messages--base \
perl-CGI--FormBuilder--Messages--default \
perl-CGI--FormBuilder--Messages--locale \
perl-CGI--FormBuilder--Multi \
perl-CGI--FormBuilder--Source \
perl-CGI--FormBuilder--Source--File \
perl-CGI--FormBuilder--Template \
perl-CGI--FormBuilder--Template--Builtin \
perl-CGI--FormBuilder--Template--CGI-SSI \
perl-CGI--FormBuilder--Template--Div \
perl-CGI--FormBuilder--Template--Fast \
perl-CGI--FormBuilder--Template--HTML \
perl-CGI--FormBuilder--Template--TT2 \
perl-CGI--FormBuilder--Template--Text \
perl-CGI--FormBuilder--Test \
perl-CGI--FormBuilder--Util \
perl-CGI-FormBuilder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CGI"

inherit rpm
