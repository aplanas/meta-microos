SUMMARY = "Paragraph reformatter"
DESCRIPTION = "par is a filter which copies its input to its output, changing all \
white characters (except newlines) to spaces, and reformatting \
each paragraph.  Paragraphs are separated by protected, blank, and \
bodiless lines, and optionally delimited by indentation. \
 \
Each output paragraph is generated from the corresponding input \
paragraph as follows: \
 \
1) An optional prefix and/or suffix is removed from each input line. \
2) The remainder is divided into words (separated by spaces). \
3) The words are joined into lines to make an eye-pleasing paragraph. \
4) The prefixes and suffixes are reattached. \
 \
If there are suffixes, spaces are inserted before them so that they all \
end in the same column."
LICENSE = "MIT"

PV = "1.53.0+git.1584347654.eb0590f"

RPM_NAME = "par_text-1.53.0+git.1584347654.eb0590f-3.3.aarch64.rpm"
RPM_HASH = "b46cce0cd5b965921c22d77f1e11268146f2ea1c8b5b2c0d0acccb0fabbc8ce88f158abbf778194fbdb6bb38e8dec65542cde46a8d1c677915f08582c5ac29a7"

RPROVIDES:${PN} += "par_text \
par_text(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
