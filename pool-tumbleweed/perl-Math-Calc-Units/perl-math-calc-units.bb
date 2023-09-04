SUMMARY = "Human-readable unit-aware calculator"
DESCRIPTION = "Math::Calc::Units is a simple calculator that keeps track of units. It \
currently handles combinations of byte sizes and duration only, although adding \
any other multiplicative types is easy. Any unknown type is treated as a unique \
user type (with some effort to map English plurals to their singular forms). \
 \
The primary intended use is via the ucalc script that prints out all of the \
'readable' variants of a value. For example, '3 bytes' will only produce '3 \
byte', but '3 byte / sec' produces the original along with '180 byte / minute', \
'10.55 kilobyte / hour', etc."
LICENSE = "Artistic-1.0"

PV = "1.07"

RPM_NAME = "perl-Math-Calc-Units-1.07-7.31.aarch64.rpm"
RPM_HASH = "dcb27267f9897b56ac6058864482d0f1255137ed713ec5f453a66486fec3b94a4f132ea5a3bb1e14c617382007ff5e6e7ccb9a4097581633085345ff2376b309"

RPROVIDES:${PN} += "Math-Calc-Units \
perl-Math--Calc--Units \
perl-Math--Calc--Units--Compute \
perl-Math--Calc--Units--Convert \
perl-Math--Calc--Units--Convert--Base \
perl-Math--Calc--Units--Convert--Base2Metric \
perl-Math--Calc--Units--Convert--Byte \
perl-Math--Calc--Units--Convert--Combo \
perl-Math--Calc--Units--Convert--Date \
perl-Math--Calc--Units--Convert--Distance \
perl-Math--Calc--Units--Convert--Metric \
perl-Math--Calc--Units--Convert--Multi \
perl-Math--Calc--Units--Convert--Time \
perl-Math--Calc--Units--Grammar \
perl-Math--Calc--Units--Rank \
perl-Math-Calc-Units \
perl-Parse--Yapp--Driver"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
