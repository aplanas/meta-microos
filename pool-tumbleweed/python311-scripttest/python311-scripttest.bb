SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python311-scripttest-1.3-8.1.noarch.rpm"
RPM_HASH = "0655ae4aec6b38b039b4588160b72de60270569b0f15d9e115800b8f07900545983722f5bb4973bc0e90b1779e9ac61446ad9493c994a099ce2cb53c5e69b11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scripttest \
python311-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
