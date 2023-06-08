SUMMARY = "Extra translations for Thunderbird"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.10.1"

RPM_NAME = "MozillaThunderbird-translations-other-102.10.1-1.1.aarch64.rpm"
RPM_HASH = "36464efdf1cdc55bb01d551e331741d50023975cc6097639938744621810268b0c1525c7d0e4e786c5da0a2582a6ac77984b41545d7b59ce33a141bda3fe8869"

RPROVIDES:${PN} += "MozillaThunderbird-translations-other MozillaThunderbird-translations-other(aarch-64) locale(MozillaThunderbird:ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en_CA;eo;es_MX;et;eu;fa;ff;fy_NL;ga_IE;gd;gl;gn;gu_IN;he;hi_IN;hr;hsb;hy_AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne_NP;nn_NO;oc;pa_IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh)"
RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
