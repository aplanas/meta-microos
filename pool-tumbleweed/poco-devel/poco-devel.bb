SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "poco-devel-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "5889f9567fe0dcafed5000b6ad86d31d8023bfe299ad36c62dd5ea7f0f4ae3de67723c7b5463d37052ea5d924f8d77ba004281c5ab3bb3a26d6127865c06ae40"

RPROVIDES:${PN} += "cmake-Poco \
cmake-PocoActiveRecord \
cmake-PocoCppParser \
cmake-PocoCrypto \
cmake-PocoData \
cmake-PocoDataMySQL \
cmake-PocoDataODBC \
cmake-PocoDataSQLite \
cmake-PocoEncodings \
cmake-PocoFoundation \
cmake-PocoJSON \
cmake-PocoJWT \
cmake-PocoMongoDB \
cmake-PocoNet \
cmake-PocoNetSSL \
cmake-PocoPDF \
cmake-PocoPrometheus \
cmake-PocoRedis \
cmake-PocoUtil \
cmake-PocoXML \
cmake-PocoZip \
libpoco-devel \
poco-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoCppParser94 \
libPocoCrypto94 \
libPocoData94 \
libPocoDataMySQL94 \
libPocoDataODBC94 \
libPocoDataSQLite94 \
libPocoEncodings94 \
libPocoFoundation.so.94 \
libPocoFoundation94 \
libPocoJSON94 \
libPocoJWT94 \
libPocoMongoDB94 \
libPocoNet94 \
libPocoNetSSL94 \
libPocoPDF94 \
libPocoPrometheus94 \
libPocoRedis94 \
libPocoUtil.so.94 \
libPocoUtil94 \
libPocoXML.so.94 \
libPocoXML94 \
libPocoZip94 \
libc.so.6 \
libexpat-devel \
libgcc-s.so.1 \
libmysqlclient-devel \
libstdc++-devel \
libstdc++.so.6 \
openssl-devel \
pcre-devel \
poco-cpspc \
unixODBC-devel"

inherit rpm
