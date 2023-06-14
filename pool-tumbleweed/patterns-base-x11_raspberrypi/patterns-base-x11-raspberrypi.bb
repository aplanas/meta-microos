SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_raspberrypi-20200505-41.1.aarch64.rpm"
RPM_HASH = "8f0cfafdf482b31c5f1a97a4009a540203b0343ef5f92328ba453da82ae5e4af34fdd057cdfc74bf447551547ac9ae02bcaa97a6e6b1d2dea6a66558ad0578a7"

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
