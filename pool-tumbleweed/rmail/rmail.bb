SUMMARY = "Rmail of the BSD Sendmail"
DESCRIPTION = "Rmail interprets incoming mail received via uucp and passing the \
processed mail on to the MTA (e.g. sendmail)."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "rmail-8.17.1-9.1.aarch64.rpm"
RPM_HASH = "efdb14ff8f4f5072790b3f83ce08a50e87c7b2386f258b83d94dd624f2e3d40e9a1f5f64d17b298e10cad4550d240ad32b0c86d7605bad8633e1338d1812b471"

RPROVIDES:${PN} += "rmail \
rmail(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libldap.so.2()(64bit)"

inherit rpm
