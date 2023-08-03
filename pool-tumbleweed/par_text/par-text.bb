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

RPM_NAME = "par_text-1.53.0+git.1584347654.eb0590f-5.1.aarch64.rpm"
RPM_HASH = "edc48699ebc7346524bebdf87166ede894ec2d2a1cc9c7c5c08b1b1312dafcd1c711ae395e2bc55f12e5d496c7b1b3b19b1510c5318a825975039f72b0e12e23"

RPROVIDES:${PN} += "par-text"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
