SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that repackages Java libraries and embeds \
them into a distribution of its own. This is useful for two reasons: \
You can easily ship a single jar file with no external dependencies. \
You can avoid problems where your library depends on a specific \
version of a library, which may conflict with the dependencies of \
another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-javadoc-1.4-4.12.noarch.rpm"
RPM_HASH = "833d5a34e7cffa68a40e7b201b8aa5091ad97844cd08d61e90675116d00dc530b661f8f3a3dd03de32170ef768aeb8ecb12aabc13cc9113c36b6dd26313f3804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jarjar-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
