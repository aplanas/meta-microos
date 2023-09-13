SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "115.2.0"

RPM_NAME = "MozillaThunderbird-translations-other-115.2.0-1.1.aarch64.rpm"
RPM_HASH = "3898cf3cf992795cab30a99937f7ab44881de0b256a179cfda46b8e45c5a7a1ed16de92a4b79189efeb28bb29f0c0c97d0ffa1e75d152b616d292fe708243a0b"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other \
locale-MozillaThunderbird-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
