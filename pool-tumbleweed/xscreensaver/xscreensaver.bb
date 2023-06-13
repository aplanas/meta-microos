SUMMARY = "A screen saver and locker for the X Window System"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
The xscreensaver package consists of two parts: the screensaver and \
the 'driver' or 'daemon', which detects idleness and does locking, \
and the many graphics demos that are launched by xscreensaver. \
 \
Any X program that can draw on the root window can be used with \
xscreensaver, regardless of how that program is written, what \
language it is written in, or what libraries it uses. The \
xscreensaver daemon takes care of detecting when the user is idle, \
locking, and checking passwords and all the other book-keeping. All \
the other programs need to do is draw. \
 \
The benefit that xscreensaver has over the combination of the xlock \
and xautolock programs is the ease with which new graphic hacks can \
be installed. You do not need to recompile (or even re-run) the \
xscreensaver program to add a new display mode, you just change a \
config file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-6.06-4.3.aarch64.rpm"
RPM_HASH = "a97ebd3cbc7311d9cdecdcf23c01a14debfe98e99d6beb54f54dc55e3bcd6772a3e98322c842047b844f698e362707794c7a505d065b9cb2af5c932d7554e2cc"

RPROVIDES:${PN} += "application() \
application(xscreensaver-settings.desktop) \
application(xscreensaver.desktop) \
config(xscreensaver) \
font(:lang=aa) \
font(:lang=af) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=ca) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=cy) \
font(:lang=da) \
font(:lang=de) \
font(:lang=el) \
font(:lang=en) \
font(:lang=eo) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kl) \
font(:lang=ku-tr) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=la) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=mk) \
font(:lang=mo) \
font(:lang=ms) \
font(:lang=mt) \
font(:lang=na) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=nso) \
font(:lang=ny) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=os) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=se) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=uk) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(classicconsole) \
font(gallant12x22) \
font(luximono) \
font(ocrastd) \
font(specialelite) \
xscreensaver \
xscreensaver(aarch-64) \
xscreensaver-gnome \
xscrns"

RDEPENDS:${PN} += "/bin/sh \
/sbin/unix2_chkpwd \
desktop-data \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXt.so.6()(64bit) \
libXxf86vm.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpam.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_232)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libxml2.so.2()(64bit) \
xscreensaver-data"

inherit rpm
