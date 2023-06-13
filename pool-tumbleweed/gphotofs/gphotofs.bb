SUMMARY = "User Level File System for gphoto-Based Cameras"
DESCRIPTION = "This package provides a fuse module to make digital cameras supported \
by libgphoto2 visible as a file system. \
 \
 \
 \
Authors: \
-------- \
    Scott Fritzinger <scottf@scs.unr.edu> \
    Lutz Müller <lutz@users.sourceforge.net> \
 \
    Eugene Crosser <crosser@average.org> \
    Matt Martin <matt.martin@ieee.org> \
    Gary Ross <gdr@hooked.net> \
    M. Adam Kendall <joker@penguinpub.com> \
    Del Simmons <del@gphoto.org> \
    Bob Paauwe <bpaauwe@bobsplace.com> \
    Cliff Wright <cliff@snipe444.org> \
    Phill Hugo <phill@gphoto.org> \
    Beat Christen <spiff@longstreet.ch> \
    Warren Baird <wjbaird@bigfoot.com> \
    Brent D. Metz <bmetz@vt.edu> \
    Brian Hirt <bhirt@loopy.berkhirt.com> \
    Mandrake <mandrake@lobotomy.com> \
    Randy D. Scott <scottr@wwa.com> \
    Paul S. Jenner <psj@mustec.eu.org> \
    Tuomas Kuosmanen <tigert@gimp.org> \
    Ole Aamot <oleaa@ifi.uio.no> \
    Mariusz Zynel <mariusz@mizar.org> \
    Johannes Erdfelt <johannes@erdfelt.com> \
    Werner Almesberger <almesber@lrc.di.epfl.ch> \
    Ole W. Saastad <o.w.saastad@kjemi.uio.no> \
    Veros Kaplan <xkaplan@informatics.muni.cz> \
    Wolfgang Reissnegger \
    Philippe Marzouk <philm@users.sourceforge.net> \
    Edouard Lafargue <lafargue@oslo.geco-prakla.slb.com> \
    Bart van Leeuwen <bart@netage.nl> \
    M. Adam Kendall <joker@penguinpub.com> \
    Mark Davies <mdavies@dial.pipex.com> \
    Beat Christen <spiff@longstreet.ch> \
    Gus Hartmann <hartmann@madison-expat.net> \
    Raymond Penners <raymond@dotsphinx.com> \
    Marcus Meissner <marcus@jet.franken.de> \
    Hans Ulrich Niedermann <hun@users.sourceforge.net> \
    Colin Marquardt <cmarqu@users.sourceforge.net>"
LICENSE = "GPL-2.0+"

PV = "0.5"

RPM_NAME = "gphotofs-0.5-7.27.aarch64.rpm"
RPM_HASH = "5a3ef0623df0ce35a8fbd3b3f71938cf6b7e805a9d777aecbe09bb102fdcb64708ee6420a724cd625e27d5ba03395494af327c97babf5e623c550bc3c52b78fb"

RPROVIDES:${PN} += "gphotofs \
gphotofs(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit)"

inherit rpm
