SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "112.0.2"

RPM_NAME = "MozillaFirefox-translations-other-112.0.2-2.1.aarch64.rpm"
RPM_HASH = "cdf7b26b0a836cd2c93f6103ffdcd38a2e9b95472f82620c9f636e60f9420321109ecf12fabadac561fb4c3dbb37bdba8b048642d75aeea9c633eb89f6cb2870"

RPROVIDES:${PN} += "MozillaFirefox-translations-other MozillaFirefox-translations-other(aarch-64) locale(MozillaFirefox:ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en_CA;eo;es_MX;et;eu;fa;ff;fy_NL;ga_IE;gd;gl;gn;gu_IN;he;hi_IN;hr;hsb;hy_AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne_NP;nn_NO;oc;pa_IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh)"
RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
