SUMMARY = "Hyper-V Enhanced session setup for openSUSE"
DESCRIPTION = "* Completes pre-requisite setup for an openSUSE VM on Hyper-V to be able to use 'Enhanced session'. \
* Works with lightdm, NOT sddm. gdm isn't an issue and is difficult to remove from a Gnome install. \
* In PowerShell, run 'Set-VM -VMName <name of vm> -EnhancedSessionTransportType HvSocket' to enable. \
* Provides /etc/xrdp/startwm.sh.userwindowmanager-sample to use in '$HOME'."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "hyper-v-enhanced-session-1.0.1-2.3.noarch.rpm"
RPM_HASH = "bf5153053f895f547227d2b931ac5584103528966b5cb5061d60357e4b93b0bb12ef7e8a99f67b24905325f61d90099b1bcca46f1397ca60471b1db98ef843bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(hyper-v-enhanced-session) \
hyper-v-enhanced-session"
RDEPENDS:${PN} += "(kmod(hv_sock.ko) if kernel) \
(lightdm or gdm or kdm) \
/bin/sh \
hyper-v \
vncmanager \
xmessage \
xorg-x11-Xvnc-novnc \
xorgxrdp \
xrdp"

inherit rpm
