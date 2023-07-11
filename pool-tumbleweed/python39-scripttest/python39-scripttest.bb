SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python39-scripttest-1.3-8.2.noarch.rpm"
RPM_HASH = "de96d2b2b9183b7d4034086f0762a7d8dcbe7b2aa0976ac8d48925e1a22969c4391cf765ef1b602034abfe1f4522102df5f672258a4e254411aa287cabd47464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scripttest \
python39-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
