SUMMARY = "A GUI for Vi"
DESCRIPTION = "Package gvim contains the largest set of features of vim, which is \
graphical windows and language interpreter, like python, ruby, or perl. \
You need package vim for the help and other documentation too. If you \
want less features, you might want to install vim instead."
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "gvim-9.0.1572-1.1.aarch64.rpm"
RPM_HASH = "01808ee7d23e226baf33c23fcb70684b2bd24f3bc615f79c23ac6c9ec2243050104e47229ac92233d7d865b5a04257e851a75c715b267e07e27e875383edaec5"

RPROVIDES:${PN} += "application() \
application(gvim.desktop) \
config(gvim) \
gvim \
gvim(aarch-64) \
gvim-base \
gvim-enhanced \
gvim_client \
mimehandler(application/x-shellscript) \
mimehandler(text/english) \
mimehandler(text/plain) \
mimehandler(text/x-c) \
mimehandler(text/x-c++) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-java) \
mimehandler(text/x-makefile) \
mimehandler(text/x-moc) \
mimehandler(text/x-pascal) \
mimehandler(text/x-tcl) \
mimehandler(text/x-tex) \
vi \
vim_client"

RDEPENDS:${PN} += "/bin/sh \
alts \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXt.so.6()(64bit) \
libacl.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpm.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libperl.so()(64bit) \
libselinux.so.1()(64bit) \
libtinfo.so.6()(64bit) \
vim-data \
xxd"

inherit rpm
