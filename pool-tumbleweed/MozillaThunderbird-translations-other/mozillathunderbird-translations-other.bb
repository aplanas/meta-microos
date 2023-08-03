SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.13.1"

RPM_NAME = "MozillaThunderbird-translations-other-102.13.1-1.1.aarch64.rpm"
RPM_HASH = "c4b96f1cad54a512d6315b8ed45a87f3228566eea0dc6a8b774900b35e1754c1147b908bbc414bd83c22ddb2b5d6a2a7b26ab7c043c8b4c30705dd4924150222"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other \
locale-MozillaThunderbird-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
