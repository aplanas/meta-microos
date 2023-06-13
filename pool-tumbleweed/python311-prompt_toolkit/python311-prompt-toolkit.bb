SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python311-prompt_toolkit-3.0.38-2.1.noarch.rpm"
RPM_HASH = "8fc78fb1b5839ba181e4b8296c8809a6ef47e8c989a0f85daa8ce0a4c57bcffc91f43b6734c864fb1d9bece7760516ce8f228a21440512552b2a40323a518093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(prompt-toolkit) \
python311-prompt_toolkit \
python3dist(prompt-toolkit)"

RDEPENDS:${PN} += "python(abi) \
python311-wcwidth"

inherit rpm
