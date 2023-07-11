SUMMARY = "USB Scanner Autoconfiguration"
DESCRIPTION = "USB scanner autoconfiguration happens via udev. \
 \
The file /udev/rules.d/56-sane-backends-autoconfig.rules contains \
entries for those USB scanners where the USB IDs are known, which are \
supported by a free driver, where the support status is 'complete' or \
'good', and which do not require firmware upload. \
 \
When a USB scanner is connected and its USB IDs match to an entry in \
the 56-sane-backends-autoconfig.rules file, the matching scanner driver \
is activated (i.e. the driver line in /etc/sane.d/dll.conf is \
activated). \
 \
It enables scanner drivers but never disables them. The reason is that \
enabled drivers do not hurt so that an automated disable would make it \
only overcomplicated because when more than one scanner uses the same \
driver, a complicated check would be needed to avoid that the driver is \
accidentally disabled when only one scanner was disconnected. \
 \
If you do not like automated driver activation, do not install this \
package or remove it when it is already installed."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-backends-autoconfig-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "3a520a36d25f15052c4c393e6600fd49c6fd4089a1d982a081b5441f759f012c720c5fc10cafdba75752c229e676a4178017faa8287e54375e56fd390f04b94c"

RPROVIDES:${PN} += "sane-backends-autoconfig"

RDEPENDS:${PN} += "libsane1"

inherit rpm
