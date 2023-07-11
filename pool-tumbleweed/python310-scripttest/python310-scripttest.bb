SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python310-scripttest-1.3-8.2.noarch.rpm"
RPM_HASH = "ff8952ad0b8ed35572b839c82fa34445a6f35d464212056f1158bb7d5a2b4a8f9e563a5ee584c013cc4ab63254d5d5d9b1fab209c2ec749cd7c38a2151133772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scripttest \
python310-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
