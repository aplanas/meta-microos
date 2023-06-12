SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "113.0.2"

RPM_NAME = "MozillaFirefox-translations-other-113.0.2-1.1.aarch64.rpm"
RPM_HASH = "d6689862f39ffa1c6c7fce6a6a9d22192ee48eebb1850c4d17d0a75464c0e123272ac5487dc76d2381982067f6c71c553f3b28e79aed49859f3a3f8420aa5b01"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
MozillaFirefox-translations-other(aarch-64) \
locale(MozillaFirefox:ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en_CA;eo;es_MX;et;eu;fa;ff;fy_NL;ga_IE;gd;gl;gn;gu_IN;he;hi_IN;hr;hsb;hy_AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne_NP;nn_NO;oc;pa_IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh)"
RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
