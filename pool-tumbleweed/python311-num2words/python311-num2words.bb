SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python311-num2words-0.5.12-1.6.noarch.rpm"
RPM_HASH = "f3b8ba62005405ece97517c29e541ebf73a071eed2a19f4e6901dfa5434f901344a2c16f3ca5da377a2edc68f1f260e52c834328cbc90e0240b81c3290af48cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-num2words \
python3.11dist-num2words \
python311-num2words \
python3dist-num2words"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
update-alternatives"

inherit rpm
