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

RPM_NAME = "perl-FreezeThaw-0.5001-19.31.aarch64.rpm"
RPM_HASH = "5259414c4661c6f01fa0633acc5ddf3888c9cda6ec64bc2dad8353b5a36f0325611def2401428b4abd08bb1e3b2d605bcf5669b7c9162026ff78aec8dd0cceb9"

RPROVIDES:${PN} += "perl-FreezeThaw"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
