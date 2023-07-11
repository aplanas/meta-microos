SUMMARY = "Converting Perl structures to strings and back"
DESCRIPTION = "Converts data to/from stringified form, appropriate for saving-to/reading-from \
permanent storage. \
 \
Deals with objects, circular lists, repeated appearence of the same refence. \
Does not deal with overloaded stringify operator yet. \
 \
  Author:	Ilya Zakharevich"
LICENSE = "Artistic-1.0"

PV = "0.5001"

RPM_NAME = "perl-FreezeThaw-0.5001-19.30.aarch64.rpm"
RPM_HASH = "c4564658d63d9f2ac10d04ee8e7741e54b18c381f14c4eb641a277ceba4d3c542054ae680b1657693713a08670979240e64d9267830a11b34df65dc1dedc7602"

RPROVIDES:${PN} += "perl-FreezeThaw"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
