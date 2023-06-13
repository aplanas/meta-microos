SUMMARY = "Geolocation database files for xt_geoip"
DESCRIPTION = "The package contains the GeoIP definition files (which IP addresses \
belong to which country) that are needed for Xtables-addons's \
xt_geoip module. \
 \
This product includes Country Lite data created by DBIP, available from \
https://db-ip.com/db/lite.php . \
Please do not contact them for errors with this package."
LICENSE = "CC-BY-4.0"

PV = "20201001"

RPM_NAME = "xtables-geoip-20201001-1.8.noarch.rpm"
RPM_HASH = "943952aff290c020bf4f615a47ab2f78a63c398f57e73477d0a8a8c84f0e67c0bda5e8fb17237adf6771de8fb426d9056c1b2f90b5497e297635a56dee9bc27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtables-geoip"

RDEPENDS:${PN} += ""

inherit rpm
