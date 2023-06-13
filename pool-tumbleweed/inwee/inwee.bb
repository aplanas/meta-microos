SUMMARY = "Wrapper around WeeChat's FIFO pipe"
DESCRIPTION = "Conveniently send text and commands from file or standard input to WeeChat with this wrapper around WeeChat's FIFO pipe"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "inwee-0.2.0-1.10.noarch.rpm"
RPM_HASH = "91cb1706cbc69c6535895e848f5c3c1098d5b258b0de08ce4c50debbcb070762c3f831ee6e72f3ccdec353c096e1211699617d038695afdd0622ba33ed161bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inwee"

RDEPENDS:${PN} += "/bin/sh \
weechat"

inherit rpm
