SUMMARY = "Hyper-V Enhanced session setup for openSUSE"
DESCRIPTION = "* Completes pre-requisite setup for an openSUSE VM on Hyper-V to be able to use 'Enhanced session'. \
* Works with lightdm, NOT sddm. gdm isn't an issue and is difficult to remove from a Gnome install. \
* In PowerShell, run 'Set-VM -VMName <name of vm> -EnhancedSessionTransportType HvSocket' to enable. \
* Provides /etc/xrdp/startwm.sh.userwindowmanager-sample to use in '$HOME'."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "hyper-v-enhanced-session-1.0.1-2.4.noarch.rpm"
RPM_HASH = "116fb32ca7f239379981f10db83346bf3d3cc7503c2dedc32e3c56e2311479935806c023014cf287406d2dc4cad7c6700588affedfaf944c49426399e8b8bf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hyper-v-enhanced-session \
hyper-v-enhanced-session"

RDEPENDS:${PN} += "/usr/bin/sh \
hyper-v \
vncmanager \
xmessage \
xorg-x11-Xvnc-novnc \
xorgxrdp \
xrdp"

inherit rpm
