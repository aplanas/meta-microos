SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python310-yattag-1.15.1-1.3.noarch.rpm"
RPM_HASH = "85339fb852f0d70f478b8264f57271824dee11a5caf8b97d25b19cdbd19655efdfc6df7231d6dae5f09d5d59384931893f4d4b780c0031fa02c7ae879f397895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yattag \
python310-yattag \
python3dist-yattag"

RDEPENDS:${PN} += "python-abi"

inherit rpm
