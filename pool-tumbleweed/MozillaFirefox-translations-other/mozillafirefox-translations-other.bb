SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.3"

RPM_NAME = "MozillaFirefox-translations-other-115.0.3-1.1.aarch64.rpm"
RPM_HASH = "2354b0e6f2eaf358d4141b669d45461a6e6490e17dbbc0469ffe4d4d928eb0d6bc4ad85ef33e35eebbd5ac82dc798b793b5bb577ae613948970606de172df29f"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
locale-MozillaFirefox-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
