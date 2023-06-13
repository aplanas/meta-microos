SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python311-cmarkgfm-2022.10.27-2.1.aarch64.rpm"
RPM_HASH = "0574c2f97814f105d07f07206125bb82f8ba2de13c47110d201ba10e440591069f3063e3bbcdffe50a896027dd3090ae4821de074780e64cda7bd130aaa6ade8"

RPROVIDES:${PN} += "python3.11dist(cmarkgfm) \
python311-cmarkgfm \
python311-cmarkgfm(aarch-64) \
python3dist(cmarkgfm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-cffi"

inherit rpm
