SUMMARY = "Documentation for python-debtcollector"
DESCRIPTION = "A collection of Python deprecation patterns and strategies that help \
you collect your technical debt in a non-destructive manner. The goal \
of this library is to provide well documented developer facing \
deprecation patterns that start of with a basic set and can expand \
into a larger set of patterns as time goes on. The desired output of \
these patterns is to apply the warnings module to emit \
DeprecationWarning or PendingDeprecationWarning or similar derivative \
to developers using libraries (or potentially applications) about \
future deprecations. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python-debtcollector-doc-2.5.0-1.5.noarch.rpm"
RPM_HASH = "5ce69d3ec9f7440d1f34d3e7857b4f01acff10e070759333e932a7970496712d1f16b4e099e8d8363a5c8d3098433175b9a48dc08e3b51bd390556fefac028c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-debtcollector-doc"

RDEPENDS:${PN} += ""

inherit rpm
