SUMMARY = "Parse JSON"
DESCRIPTION = "A module for parsing JSON. (JSON means 'JavaScript Object Notation' and it \
is specified in RFC 8259.) \
 \
JSON::Parse offers the function parse_json, which takes a string containing \
JSON, and returns an equivalent Perl structure. It also offers validation \
of JSON via valid_json, which returns true or false depending on whether \
the JSON is correct or not, and assert_valid_json, which produces a \
descriptive fatal error if the JSON is invalid. A function read_json reads \
JSON from a file, and there is a safer version of parse_json called \
parse_json_safe which doesn't throw exceptions. \
 \
For special cases of parsing, there are also methods new and parse, which \
create a JSON parsing object and run it on text. See METHODS. \
 \
JSON::Parse accepts only UTF-8 as input. See UTF-8 only and Handling of \
Unicode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.62"

RPM_NAME = "perl-JSON-Parse-0.62-1.6.aarch64.rpm"
RPM_HASH = "c0d27d9e24e97d0941ad60a7aea57d3f3bb2d0a31fde70c95cae23b7cbda171f1005b29fc6918627efb8ca5c5bd7c091442437ba845d2c3ca920354f4c99c35e"

RPROVIDES:${PN} += "perl-JSON--Parse \
perl-JSON--Tokenize \
perl-JSON--Whitespace \
perl-JSON-Parse"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
