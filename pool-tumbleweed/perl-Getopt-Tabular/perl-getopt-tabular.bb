SUMMARY = "table-driven argument parsing for Perl 5"
DESCRIPTION = "*Getopt::Tabular* is a Perl 5 module for table-driven argument parsing, \
vaguely inspired by John Ousterhout's Tk_ParseArgv. All you really need to \
do to use the package is set up a table describing all your command-line \
options, and call &GetOptions with three arguments: a reference to your \
option table, a reference to '@ARGV' (or something like it), and an \
optional third array reference (say, to '@newARGV'). &GetOptions will \
process all arguments in '@ARGV', and copy any leftover arguments (i.e. \
those that are not options or arguments to some option) to the '@newARGV' \
array. (If the '@newARGV' argument is not supplied, 'GetOptions' will \
replace '@ARGV' with the stripped-down argument list.) If there are any \
invalid options, 'GetOptions' will print an error message and return 0. \
 \
Before I tell you all about why Getopt::Tabular is a wonderful thing, let \
me explain some of the terminology that will keep popping up here. \
 \
* argument \
 \
  any single word appearing on the command-line, i.e. one element of the \
  '@ARGV' array. \
 \
* option \
 \
  an argument that starts with a certain sequence of characters; the \
  default is '-'. (If you like GNU-style options, you can change this to \
  '--'.) In most Getopt::Tabular-based applications, options can come \
  anywhere on the command line, and their order is unimportant (unless one \
  option overrides a previous option). Also, Getopt::Tabular will allow any \
  non-ambiguous abbreviation of options. \
 \
* option argument \
 \
  (or _value_) an argument that immediately follows certain types of \
  options. For instance, if '-foo' is a scalar-valued integer option, and \
  '-foo 3' appears on the command line, then '3' will be the argument to \
  '-foo'. \
 \
* option type \
 \
  controls how 'GetOptions' deals with an option and the arguments that \
  follow it. (Actually, for most option types, the type interacts with the \
  'num_values' field, which determines whether the option is scalar- or \
  vector-valued. This will be fully explained in due course.)"
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.3"

RPM_NAME = "perl-Getopt-Tabular-0.3-1.28.noarch.rpm"
RPM_HASH = "5ebe29a2d863023d4241e6a6b9e595bc8b9458ce122f26edd72ca7e342bd9d6e6afdd8031a72ffa28ff4c837c14f10d0945ca1984e3174e60d4e5883e75236f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Getopt--Tabular \
perl-Getopt-Tabular"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
