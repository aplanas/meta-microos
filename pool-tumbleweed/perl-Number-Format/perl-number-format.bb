SUMMARY = "Perl extension for formatting numbers"
DESCRIPTION = "These functions provide an easy means of formatting numbers in a manner \
suitable for displaying to the user. \
 \
There are two ways to use this package. One is to declare an object of type \
Number::Format, which you can think of as a formatting engine. The various \
functions defined here are provided as object methods. The constructor \
'new()' can be used to set the parameters of the formatting engine. Valid \
parameters are: \
 \
  THOUSANDS_SEP     - character inserted between groups of 3 digits \
  DECIMAL_POINT     - character separating integer and fractional parts \
  MON_THOUSANDS_SEP - like THOUSANDS_SEP, but used for format_price \
  MON_DECIMAL_POINT - like DECIMAL_POINT, but used for format_price \
  INT_CURR_SYMBOL   - character(s) denoting currency (see format_price()) \
  DECIMAL_DIGITS    - number of digits to the right of dec point (def 2) \
  DECIMAL_FILL      - boolean; whether to add zeroes to fill out decimal \
  NEG_FORMAT        - format to display negative numbers (def ``-x'') \
  KILO_SUFFIX       - suffix to add when format_bytes formats kilobytes (trad) \
  MEGA_SUFFIX       -    '    '  '    '        '         '    megabytes (trad) \
  GIGA_SUFFIX       -    '    '  '    '        '         '    gigabytes (trad) \
  KIBI_SUFFIX       - suffix to add when format_bytes formats kibibytes (iec) \
  MEBI_SUFFIX       -    '    '  '    '        '         '    mebibytes (iec) \
  GIBI_SUFFIX       -    '    '  '    '        '         '    gibibytes (iec)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.76"

RPM_NAME = "perl-Number-Format-1.76-1.3.noarch.rpm"
RPM_HASH = "cb5b0ea1e78e4e8780da474a46b616c9d9e874bfd7c415ec6f9a16f7d1a9ccd6e0fa021ac4589be9dc0b79b0b3035358948fc8480c5ed448908c6133c1ef83a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Format \
perl-Number-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
