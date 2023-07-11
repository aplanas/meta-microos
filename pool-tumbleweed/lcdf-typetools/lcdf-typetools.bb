SUMMARY = "Programs to manipulate OpenType and multiple-master fonts"
DESCRIPTION = "This package contains four tools for working with OpenType fonts: \
 \
 cfftot1    allows you to translate Compact Font Format (CFF) or \
            PostScript-flavored OpenType fonts into PostScript \
            Type 1 font format \
 \
 otfinfo    reports information about OpenType fonts, such as the \
            features they support and the contents of their ``size'' \
            optical size option \
 \
 otftotfm   allows you to create TeX font metrics and encodings for \
            using OpenType fonts \
 \
 t1dotlessj creates a Type 1 font with a single character -- \
            the dotless j corresponding to the specified design \
 \
 t1lint     checks a Type 1 font for correctness (preliminary) \
 \
 t1reencode reencodes a Type 1 font, replacing its internal encoding with \
            one you specify \
 \
 t1testpage creates a PostScript test page for a specified \
            font file (preliminary) \
 \
The package now includes programs for working with multiple-master \
fonts formerly distributed as mminstance.  These tools allow you to \
use multiple-master fonts with programs that require single-master \
fonts (afm2tfm, ps2pk, fontinst, etc.).  Both programs work fine with \
fonts that contain intermediate masters (e.g., Adobe Jenson MM and \
Adobe Kepler MM). \
 \
mmafm        creates an AFM (Adobe font metric) file corresponding to \
             a single instance of a multiple-master font.  It reads \
             (and therefore requires) the AMFM and AFM files \
             distributed with the font. \
 \
mmpfb        creates a normal, single-master font program that looks \
             like an instance of a multiple-master font.  It reads \
             the multiple-master font program in PFA or PFB format."
LICENSE = "GPL-2.0-only"

PV = "2.108"

RPM_NAME = "lcdf-typetools-2.108-1.11.aarch64.rpm"
RPM_HASH = "0cb03cc4a4ae2582e3a807d8229ecb5c60ca50d2ee6f6068a85ffacd0ef794c61aff039c7057dcf697c52a8ffa1d60a5a0c5b6dfd4c6489d36edde26e3cd7ebe"

RPROVIDES:${PN} += "lcdf-typetools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
