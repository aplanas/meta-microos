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

RPM_NAME = "perl-FreezeThaw-0.5001-19.29.aarch64.rpm"
RPM_HASH = "d615d7bdb8197da4c48c064748fe1c7e91ed91c9f60689c8c103a28b4ff545c32c39b5839efc98b4d61f051ad283fdba39cfc288725a74f9ccc93c98d0582736"

RPROVIDES:${PN} += "perl(FreezeThaw) \
perl-FreezeThaw \
perl-FreezeThaw(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
