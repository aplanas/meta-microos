SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "MiniZinc is a free and open-source constraint modeling language."
LICENSE = "MPL-2.0"

PV = "2.6.4"

RPM_NAME = "libminizinc-devel-2.6.4-1.5.aarch64.rpm"
RPM_HASH = "ec2c1db63366a8388b95ee8e7c10a723fa43ac2dfe2a108b7db71d04c4fa74fb808edf9966b30cd741e6394ca60055414da414e8555c4f6164e3c137fa840b6c"

RPROVIDES:${PN} += "cmake-libminizinc \
libminizinc-devel"

RDEPENDS:${PN} += "minizinc"

inherit rpm
