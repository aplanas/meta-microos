SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python310-scripttest-1.3-8.1.noarch.rpm"
RPM_HASH = "15b5babde260a08321476035a7134e222ef636929d64159f7802a0d3ffbdcd1503b9d8bec10829f649f0ff57f5d7308a7b6cf28617788488843f467bff3f8d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scripttest \
python3.10dist(scripttest) \
python310-scripttest \
python3dist(scripttest)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
