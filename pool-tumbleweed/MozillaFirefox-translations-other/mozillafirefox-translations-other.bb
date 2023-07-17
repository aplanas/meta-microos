SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.1"

RPM_NAME = "MozillaFirefox-translations-other-115.0.1-1.1.aarch64.rpm"
RPM_HASH = "47969f78d999318f35864fd914216985340159d0f26a88b6b93df1ac7f7ea92e42b983c026bf5056b95e46aac4c407016fcd0923e2adaf94261d2b744a478fff"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
locale-MozillaFirefox-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
