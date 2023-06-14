SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python311-speaklater-1.3-2.15.noarch.rpm"
RPM_HASH = "e69a622c1fc4ad66ac9ec86da878b4b4b18374f87527b20780e966101ed21a43cea46bbbeac0cee739fab53eac5a69983f891108c46874f394e0019e0a3cbe36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-speaklater \
python311-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
