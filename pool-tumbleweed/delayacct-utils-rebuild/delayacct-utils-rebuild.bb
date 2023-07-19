SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "delayacct-utils-rebuild-6.4.3-31.62.aarch64.rpm"
RPM_HASH = "101d194982a35e140b28362c24670fd101acaa864df1d660d481c42b785d992f37a616b3584afc2cb25384813d5ba8409efc51eed45b01487d78a748b7f16a06"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
