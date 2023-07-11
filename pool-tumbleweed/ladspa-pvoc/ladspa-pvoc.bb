SUMMARY = "LADSPA pvoc plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
pvoc plugin implementing a phase vocoder."
LICENSE = "GPL-2.0+"

PV = "0.1.12"

RPM_NAME = "ladspa-pvoc-0.1.12-3.26.aarch64.rpm"
RPM_HASH = "e77cfd5d6b31e6368043b937005824780402ec5f9e2743e3a264e526b33af3140e4ad98eca452dd357df13689e2221c1a183ca59b44aa661f2091bfac49f52d5"

RPROVIDES:${PN} += "ladspa-pvoc"

RDEPENDS:${PN} += "libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
