SUMMARY = "Restricting the servers that http-client will use"
DESCRIPTION = "Addition to the http-client and http-client-tls libraries, that restricts the \
HTTP servers that can be used. \
 \
This is useful when a security policy needs to eg, prevent connections to HTTP \
servers on localhost or a local network, or only allow connections to a \
specific HTTP server. \
 \
It handles restricting redirects as well as the initial HTTP connection, and it \
also guards against DNS poisoning attacks."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-0.0.5-2.8.aarch64.rpm"
RPM_HASH = "5bcaac090b2cd5c5c69236c7da97eb2a119577f84f20eaa4087e0b774fd5d63aef96244d144df7a97032cb4f5f0be287e666cc3d7786fcfde9123c5fba0273f6"

RPROVIDES:${PN} += "ghc-http-client-restricted \
libHShttp-client-restricted-0.0.5-6W52ptKb3gq2u8nffCvr0t-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-1lWb1vtDAvc6rz1D87iAo-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHSconnection-0.3.1-HritGhbYIMl4OD06E3KY8G-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHShttp-client-0.7.14-ElkaPC2YNimBwgzZzglgPe-ghc9.4.6.so \
libHShttp-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSiproute-1.7.12-A34D1N9dJmL5ps3agDCHa7-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSmime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsocks-0.6.1-5RVEIbYAf8qJqchdUVHVHw-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstreaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStls-1.6.0-D0DtS2mRMN13yCvXOGSBsv-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSx509-1.7.7-2oKbMm4GXJUL45OKqbcDfn-ghc9.4.6.so \
libHSx509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9-ghc9.4.6.so \
libHSx509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY-ghc9.4.6.so \
libHSx509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
