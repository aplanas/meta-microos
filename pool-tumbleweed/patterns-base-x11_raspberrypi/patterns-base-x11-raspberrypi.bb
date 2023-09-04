SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_raspberrypi-20200505-42.1.aarch64.rpm"
RPM_HASH = "5230d24ced4261cae804e847b01bdf64ebd4c28b65c37c860b5d33dcd1a4ef775574114cbcb193dff78cc6134cc1bb47b78f648b49021af4c298453a3589e902"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-x11-raspberrypi"

RDEPENDS:${PN} += "gconf2 \
gtk2-metatheme-adwaita \
gtk3-metatheme-adwaita \
icewm \
icewm-default \
icewm-lite \
icewm-theme-branding \
libyui-ncurses-pkg \
libyui-qt-pkg \
mutt \
mutt-lang \
pattern- \
polkit-default-privs \
polkit-gnome-lang \
x11-tools \
x11perf \
xauth \
xbacklight \
xclock \
xconsole \
xcursor-themes \
xcursorgen \
xdg-user-dirs \
xdg-user-dirs-gtk \
xdg-user-dirs-gtk-lang \
xdg-utils \
xdm \
xdmbgrd \
xdpyinfo \
xev \
xeyes \
xf86-input-evdev \
xf86-input-libinput \
xf86-video-fbdev \
xfd \
xfontsel \
xgamma \
xhost \
xinit \
xinput \
xkbcomp \
xkbevd \
xkbprint \
xkbutils \
xkeyboard-config \
xkill \
xlogo \
xlsatoms \
xlsclients \
xlsfonts \
xmag \
xmessage \
xmodmap \
xorg-x11 \
xorg-x11-fonts-core \
xorg-x11-server \
xorg-x11-server-extra \
xprop \
xrandr \
xrdb \
xrestop \
xscope \
xscreensaver \
xscreensaver-data \
xset \
xsetmode \
xsetpointer \
xsetroot \
xterm \
xtermset \
xvinfo \
xwd \
xwininfo \
yast2-control-center-qt \
yast2-packager \
yast2-snapper \
yast2-x11"

inherit rpm
