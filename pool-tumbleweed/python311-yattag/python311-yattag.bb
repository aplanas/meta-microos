SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python311-yattag-1.15.1-1.3.noarch.rpm"
RPM_HASH = "9377c5e28aa4bd81034fc1fe8a9daa641480047624f3a633c23dbcb4a00ee4b3c57972ff543987b694dfa55fcc8666f1010588d791425ea1dc54e3b5f962a471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yattag \
python3.11dist-yattag \
python311-yattag \
python3dist-yattag"

RDEPENDS:${PN} += "python-abi"

inherit rpm
