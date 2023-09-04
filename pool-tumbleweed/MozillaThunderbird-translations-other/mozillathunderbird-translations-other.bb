SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.14.0"

RPM_NAME = "MozillaThunderbird-translations-other-102.14.0-1.1.aarch64.rpm"
RPM_HASH = "f457b228f24369a6a3f47fe0c50f9e91608dea15c93471c9edde78691c5cf13ccb414c755ab9de6f84734e1594d1b36fac5c3d022e9265c6def281a5bfbbb95f"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other \
locale-MozillaThunderbird-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
