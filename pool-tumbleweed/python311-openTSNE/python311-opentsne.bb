SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python311-openTSNE-0.6.2-1.9.aarch64.rpm"
RPM_HASH = "d44cfcb3b7599ab875781389bdb5087827d277d957d53ed082195760448f60b6f904f49b5833a7393c4053383384dbe89b557c515341ab7386f33e3220c23b14"

RPROVIDES:${PN} += "python3.11dist(opentsne) \
python311-fastTSNE \
python311-openTSNE \
python311-openTSNE(aarch-64) \
python3dist(opentsne)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy \
python311-scikit-learn \
python311-scipy"

inherit rpm
