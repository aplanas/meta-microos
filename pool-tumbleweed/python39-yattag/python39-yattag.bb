SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python39-yattag-1.15.1-1.3.noarch.rpm"
RPM_HASH = "907518c2278460ba2f26e531f45e6bd038eacfc8eabb9fff3398ee73de9f946f1e1a1fa7fd0358f42d1b4589517a379634308411fcebb682b92a3c0876743cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yattag \
python39-yattag \
python3dist-yattag"

RDEPENDS:${PN} += "python-abi"

inherit rpm
