SUMMARY = "Backwards compatibility between unar and unrar"
DESCRIPTION = "Wrapper python script that transforms the basic UnRAR commands to unar \
and lsar calls in order to provide a backwards compatibility."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "unrar_wrapper-1.0.0-5.6.noarch.rpm"
RPM_HASH = "5f51ec60c027baa5bf3ac03242c7fb93d74e1f153b97fbf346e7141a488f08fda64d889ae2d584616ee0b546c1031aca7c0a733680f1d6af717219c9e13d398f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(unrar-wrapper) \
python3dist(unrar-wrapper) \
unrar \
unrar_wrapper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-setuptools \
unar"

inherit rpm
