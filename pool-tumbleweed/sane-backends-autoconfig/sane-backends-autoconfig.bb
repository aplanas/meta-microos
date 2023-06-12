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

RPM_NAME = "sane-backends-autoconfig-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "27316c8f95784e018369e2ef340dd6e523bf0ffc32ed01a9f4e9cd17dc9140607e46b1d7645bd40596994c85864bdea4ad0008071c507d381c4d0841e3e11fe8"

RPROVIDES:${PN} += "sane-backends-autoconfig \
sane-backends-autoconfig(aarch-64)"
RDEPENDS:${PN} += "libsane1"

inherit rpm
