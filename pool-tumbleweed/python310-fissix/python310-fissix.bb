SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python310-fissix-21.11.13-1.15.noarch.rpm"
RPM_HASH = "f38fe795c52d79f785450cc64317ffe3f58b4f000872e499d3ea5551671a0ac1499123f7cec2f4379f697c3802a035f84576902c5c8f818a94b64787ab543c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fissix \
python3.10dist-fissix \
python310-fissix \
python3dist-fissix"

RDEPENDS:${PN} += "python-abi \
python310-appdirs"

inherit rpm
