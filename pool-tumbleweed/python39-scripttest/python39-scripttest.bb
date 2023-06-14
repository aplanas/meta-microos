SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python39-scripttest-1.3-8.1.noarch.rpm"
RPM_HASH = "819450f68300706e9694034d37d4fdbd5db44281b81a82cdfc8b77bc154042d71dccda186b9aefbf82a76b8087698c6b4ae10ba2c233405070a4395a552e77df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scripttest \
python39-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
