SUMMARY = "API and graphical components for console"
DESCRIPTION = "JRosetta provides a common base for graphical component that could be used \
to build a graphical console in Swing with the latest requirements, such as \
command history, completion and so on for instance for scripting language \
or command line."
LICENSE = "GPL-2.0"

PV = "1.0.4"

RPM_NAME = "jrosetta-1.0.4-5.22.noarch.rpm"
RPM_HASH = "410544cd130425cae0019b8b85845ed4b0fe39272af055f9b9bfc7682f88ce13cb3cdd5d7b0f68e2400ed5b60dde7ec9a5335ed2a939ca4cf18411dab07d3bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jrosetta"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
