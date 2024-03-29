SUMMARY = "MinGW-w64 runtime libraries for Win64"
DESCRIPTION = "MinGW Win64 cross-compiler runtime, base libraries."
LICENSE = "SUSE-Public-Domain"

PV = "10.0.0"

RPM_NAME = "mingw64-runtime-10.0.0-1.3.noarch.rpm"
RPM_HASH = "0006beae09413f617efff6c8315739f579a7c4ca9ac2761c882723daf88b3cd64905e29041480f909ab57f0adb32733e5861595f80919500e73d4aa21bfc01ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-CINTIME \
mingw64-lib-PS5UI \
mingw64-lib-PSCRIPT5 \
mingw64-lib-UNIDRV \
mingw64-lib-UNIDRVUI \
mingw64-lib-acledit \
mingw64-lib-aclui \
mingw64-lib-activeds \
mingw64-lib-admparse \
mingw64-lib-admwprox \
mingw64-lib-adptif \
mingw64-lib-adsiid \
mingw64-lib-adsiisex \
mingw64-lib-adsldpc \
mingw64-lib-advapi32 \
mingw64-lib-advpack \
mingw64-lib-agentanm \
mingw64-lib-akscoinst \
mingw64-lib-alrsvc \
mingw64-lib-amstrmid \
mingw64-lib-apcups \
mingw64-lib-apphelp \
mingw64-lib-appmgmts \
mingw64-lib-appmgr \
mingw64-lib-aqueue \
mingw64-lib-asp \
mingw64-lib-aspperf \
mingw64-lib-asycfilt \
mingw64-lib-atkctrs \
mingw64-lib-atl \
mingw64-lib-atmlib \
mingw64-lib-atrace \
mingw64-lib-audiosrv \
mingw64-lib-authz \
mingw64-lib-autodisc \
mingw64-lib-avicap32 \
mingw64-lib-avifil32 \
mingw64-lib-avrt \
mingw64-lib-azroles \
mingw64-lib-basesrv \
mingw64-lib-batmeter \
mingw64-lib-batt \
mingw64-lib-bcrypt \
mingw64-lib-bits \
mingw64-lib-bluetoothapis \
mingw64-lib-bootvid \
mingw64-lib-browser \
mingw64-lib-bthci \
mingw64-lib-bthprops \
mingw64-lib-cabinet \
mingw64-lib-cabview \
mingw64-lib-cards \
mingw64-lib-catsrv \
mingw64-lib-catsrvut \
mingw64-lib-ccfgnt \
mingw64-lib-cdfview \
mingw64-lib-cdm \
mingw64-lib-certcli \
mingw64-lib-cfgbkend \
mingw64-lib-cfgmgr32 \
mingw64-lib-chtskdic \
mingw64-lib-cimwin32 \
mingw64-lib-classpnp \
mingw64-lib-clb \
mingw64-lib-clbcatq \
mingw64-lib-clfsw32 \
mingw64-lib-cliconfg \
mingw64-lib-clusapi \
mingw64-lib-cmcfg32 \
mingw64-lib-cmdial32 \
mingw64-lib-cmpbk32 \
mingw64-lib-cmutil \
mingw64-lib-cnetcfg \
mingw64-lib-cnvfat \
mingw64-lib-coadmin \
mingw64-lib-colbact \
mingw64-lib-comctl32 \
mingw64-lib-comdlg32 \
mingw64-lib-compstui \
mingw64-lib-computecore \
mingw64-lib-computenetwork \
mingw64-lib-computestorage \
mingw64-lib-comres \
mingw64-lib-comsetup \
mingw64-lib-comsnap \
mingw64-lib-comsvcs \
mingw64-lib-comuid \
mingw64-lib-connect \
mingw64-lib-console \
mingw64-lib-corpol \
mingw64-lib-credui \
mingw64-lib-crypt32 \
mingw64-lib-cryptdlg \
mingw64-lib-cryptdll \
mingw64-lib-cryptext \
mingw64-lib-cryptnet \
mingw64-lib-cryptsp \
mingw64-lib-cryptsvc \
mingw64-lib-cryptui \
mingw64-lib-cryptxml \
mingw64-lib-cscapi \
mingw64-lib-cscdll \
mingw64-lib-cscui \
mingw64-lib-csrsrv \
mingw64-lib-d2d1 \
mingw64-lib-d3d10 \
mingw64-lib-d3d11 \
mingw64-lib-d3d12 \
mingw64-lib-d3d8thk \
mingw64-lib-d3d9 \
mingw64-lib-d3dcompiler \
mingw64-lib-d3dcompiler-33 \
mingw64-lib-d3dcompiler-34 \
mingw64-lib-d3dcompiler-35 \
mingw64-lib-d3dcompiler-36 \
mingw64-lib-d3dcompiler-37 \
mingw64-lib-d3dcompiler-38 \
mingw64-lib-d3dcompiler-39 \
mingw64-lib-d3dcompiler-40 \
mingw64-lib-d3dcompiler-41 \
mingw64-lib-d3dcompiler-42 \
mingw64-lib-d3dcompiler-43 \
mingw64-lib-d3dcompiler-46 \
mingw64-lib-d3dcompiler-47 \
mingw64-lib-d3dcsx-46 \
mingw64-lib-d3dcsxd \
mingw64-lib-d3dcsxd-43 \
mingw64-lib-d3dx10 \
mingw64-lib-d3dx10-33 \
mingw64-lib-d3dx10-34 \
mingw64-lib-d3dx10-35 \
mingw64-lib-d3dx10-36 \
mingw64-lib-d3dx10-37 \
mingw64-lib-d3dx10-38 \
mingw64-lib-d3dx10-39 \
mingw64-lib-d3dx10-40 \
mingw64-lib-d3dx10-41 \
mingw64-lib-d3dx10-42 \
mingw64-lib-d3dx10-43 \
mingw64-lib-d3dx11 \
mingw64-lib-d3dx11-42 \
mingw64-lib-d3dx11-43 \
mingw64-lib-d3dx9 \
mingw64-lib-d3dx9-24 \
mingw64-lib-d3dx9-25 \
mingw64-lib-d3dx9-26 \
mingw64-lib-d3dx9-27 \
mingw64-lib-d3dx9-28 \
mingw64-lib-d3dx9-29 \
mingw64-lib-d3dx9-30 \
mingw64-lib-d3dx9-31 \
mingw64-lib-d3dx9-32 \
mingw64-lib-d3dx9-33 \
mingw64-lib-d3dx9-34 \
mingw64-lib-d3dx9-35 \
mingw64-lib-d3dx9-36 \
mingw64-lib-d3dx9-37 \
mingw64-lib-d3dx9-38 \
mingw64-lib-d3dx9-39 \
mingw64-lib-d3dx9-40 \
mingw64-lib-d3dx9-41 \
mingw64-lib-d3dx9-42 \
mingw64-lib-d3dx9-43 \
mingw64-lib-d3dxof \
mingw64-lib-davclnt \
mingw64-lib-dbgeng \
mingw64-lib-dbghelp \
mingw64-lib-dbnetlib \
mingw64-lib-dbnmpntw \
mingw64-lib-dciman32 \
mingw64-lib-dcomp \
mingw64-lib-ddraw \
mingw64-lib-delayimp \
mingw64-lib-devmgr \
mingw64-lib-devobj \
mingw64-lib-devrtl \
mingw64-lib-dhcpcsvc \
mingw64-lib-dhcpcsvc6 \
mingw64-lib-dhcpsapi \
mingw64-lib-digest \
mingw64-lib-dimsntfy \
mingw64-lib-dimsroam \
mingw64-lib-dinput \
mingw64-lib-dinput8 \
mingw64-lib-diskcopy \
mingw64-lib-dismapi \
mingw64-lib-dmconfig \
mingw64-lib-dmdskmgr \
mingw64-lib-dmivcitf \
mingw64-lib-dmoguids \
mingw64-lib-dmutil \
mingw64-lib-dmvdsitf \
mingw64-lib-dnsapi \
mingw64-lib-dnsrslvr \
mingw64-lib-dpapi \
mingw64-lib-dpnaddr \
mingw64-lib-dpnet \
mingw64-lib-dpnhupnp \
mingw64-lib-dpnlobby \
mingw64-lib-dpvoice \
mingw64-lib-drprov \
mingw64-lib-ds32gt \
mingw64-lib-dsauth \
mingw64-lib-dskquota \
mingw64-lib-dsound \
mingw64-lib-dsound3d \
mingw64-lib-dsprop \
mingw64-lib-dsquery \
mingw64-lib-dssec \
mingw64-lib-dssenh \
mingw64-lib-dsuiext \
mingw64-lib-duser \
mingw64-lib-dwmapi \
mingw64-lib-dwrite \
mingw64-lib-dxerr8 \
mingw64-lib-dxerr9 \
mingw64-lib-dxgi \
mingw64-lib-dxguid \
mingw64-lib-dxva2 \
mingw64-lib-eappcfg \
mingw64-lib-eappgnui \
mingw64-lib-eapphost \
mingw64-lib-eappprxy \
mingw64-lib-efsadu \
mingw64-lib-es \
mingw64-lib-esent \
mingw64-lib-esentprf \
mingw64-lib-eventlog \
mingw64-lib-evntagnt \
mingw64-lib-evr \
mingw64-lib-exstrace \
mingw64-lib-fastprox \
mingw64-lib-faultrep \
mingw64-lib-fcachdll \
mingw64-lib-fdeploy \
mingw64-lib-feclient \
mingw64-lib-filemgmt \
mingw64-lib-fldrclnr \
mingw64-lib-fltlib \
mingw64-lib-fmifs \
mingw64-lib-fontsub \
mingw64-lib-framedyn \
mingw64-lib-ftpctrs2 \
mingw64-lib-ftpmib \
mingw64-lib-fwpuclnt \
mingw64-lib-fxsapi \
mingw64-lib-fxscfgwz \
mingw64-lib-fxsdrv \
mingw64-lib-fxsocm \
mingw64-lib-fxsperf \
mingw64-lib-fxsroute \
mingw64-lib-fxsst \
mingw64-lib-fxst30 \
mingw64-lib-fxstiff \
mingw64-lib-fxsui \
mingw64-lib-fxswzrd \
mingw64-lib-gdi32 \
mingw64-lib-gdiplus \
mingw64-lib-getuname \
mingw64-lib-glmf32 \
mingw64-lib-glu32 \
mingw64-lib-gmon \
mingw64-lib-gpedit \
mingw64-lib-gpkcsp \
mingw64-lib-gptext \
mingw64-lib-guitrn \
mingw64-lib-hal \
mingw64-lib-hbaapi \
mingw64-lib-hgfs \
mingw64-lib-hid \
mingw64-lib-hidclass \
mingw64-lib-hidparse \
mingw64-lib-hlink \
mingw64-lib-hmmapi \
mingw64-lib-hnetcfg \
mingw64-lib-hnetwiz \
mingw64-lib-hostmib \
mingw64-lib-hotplug \
mingw64-lib-htmlhelp \
mingw64-lib-htrn-jis \
mingw64-lib-httpapi \
mingw64-lib-httpext \
mingw64-lib-httpmib \
mingw64-lib-httpodbc \
mingw64-lib-htui \
mingw64-lib-hypertrm \
mingw64-lib-iashlpr \
mingw64-lib-iaspolcy \
mingw64-lib-iassam \
mingw64-lib-iassvcs \
mingw64-lib-icaapi \
mingw64-lib-icfgnt5 \
mingw64-lib-icm32 \
mingw64-lib-icmp \
mingw64-lib-icmui \
mingw64-lib-icwconn \
mingw64-lib-icwdial \
mingw64-lib-icwdl \
mingw64-lib-icwphbk \
mingw64-lib-icwutil \
mingw64-lib-idq \
mingw64-lib-ieakeng \
mingw64-lib-iedkcs32 \
mingw64-lib-ieencode \
mingw64-lib-iernonce \
mingw64-lib-iesetup \
mingw64-lib-igmpagnt \
mingw64-lib-iis \
mingw64-lib-iisadmin \
mingw64-lib-iiscfg \
mingw64-lib-iisrtl \
mingw64-lib-iissuba \
mingw64-lib-iisui \
mingw64-lib-iisutil \
mingw64-lib-iiswmi \
mingw64-lib-imagehlp \
mingw64-lib-imeshare \
mingw64-lib-imgutil \
mingw64-lib-imjp81k \
mingw64-lib-imjpcus \
mingw64-lib-imjpdct \
mingw64-lib-imjputyc \
mingw64-lib-imm32 \
mingw64-lib-imsinsnt \
mingw64-lib-imskdic \
mingw64-lib-inetcfg \
mingw64-lib-inetcomm \
mingw64-lib-inetmib1 \
mingw64-lib-infoadmn \
mingw64-lib-infocomm \
mingw64-lib-infoctrs \
mingw64-lib-infosoft \
mingw64-lib-initpki \
mingw64-lib-input \
mingw64-lib-inseng \
mingw64-lib-iphlpapi \
mingw64-lib-ipmontr \
mingw64-lib-ipnathlp \
mingw64-lib-iprop \
mingw64-lib-iprtprio \
mingw64-lib-iprtrmgr \
mingw64-lib-ipsecsvc \
mingw64-lib-ipxsap \
mingw64-lib-irclass \
mingw64-lib-isatq \
mingw64-lib-iscomlog \
mingw64-lib-iscsidsc \
mingw64-lib-isign32 \
mingw64-lib-iyuv-32 \
mingw64-lib-jet500 \
mingw64-lib-jsproxy \
mingw64-lib-kd1394 \
mingw64-lib-kdcom \
mingw64-lib-kerberos \
mingw64-lib-kernel32 \
mingw64-lib-keymgr \
mingw64-lib-ks \
mingw64-lib-ksecdd \
mingw64-lib-ksguid \
mingw64-lib-ksuser \
mingw64-lib-ktmw32 \
mingw64-lib-largeint \
mingw64-lib-linkinfo \
mingw64-lib-lmmib2 \
mingw64-lib-loadperf \
mingw64-lib-localspl \
mingw64-lib-locationapi \
mingw64-lib-log \
mingw64-lib-loghours \
mingw64-lib-lonsint \
mingw64-lib-lpk \
mingw64-lib-lprhelp \
mingw64-lib-lsasrv \
mingw64-lib-lz32 \
mingw64-lib-m \
mingw64-lib-mag-hook \
mingw64-lib-mapi32 \
mingw64-lib-mapistub \
mingw64-lib-mcastmib \
mingw64-lib-mcd32 \
mingw64-lib-mcdsrv32 \
mingw64-lib-mchgrcoi \
mingw64-lib-mciavi32 \
mingw64-lib-mcicda \
mingw64-lib-mciole32 \
mingw64-lib-mciqtz32 \
mingw64-lib-mciseq \
mingw64-lib-mciwave \
mingw64-lib-mdminst \
mingw64-lib-mf \
mingw64-lib-mf3216 \
mingw64-lib-mfc42 \
mingw64-lib-mfc42u \
mingw64-lib-mfcore \
mingw64-lib-mfplat \
mingw64-lib-mfplay \
mingw64-lib-mfreadwrite \
mingw64-lib-mfsensorgroup \
mingw64-lib-mfuuid \
mingw64-lib-mgmtapi \
mingw64-lib-midimap \
mingw64-lib-migism \
mingw64-lib-miglibnt \
mingw64-lib-mincore \
mingw64-lib-mingw32 \
mingw64-lib-mingwex \
mingw64-lib-mingwthrd \
mingw64-lib-mlang \
mingw64-lib-mll-hp \
mingw64-lib-mll-mtf \
mingw64-lib-mll-qic \
mingw64-lib-mmdevapi \
mingw64-lib-mmfutil \
mingw64-lib-mmutilse \
mingw64-lib-mobsync \
mingw64-lib-modemui \
mingw64-lib-mofd \
mingw64-lib-moldname \
mingw64-lib-mpr \
mingw64-lib-mprapi \
mingw64-lib-mprddm \
mingw64-lib-mprmsg \
mingw64-lib-mprui \
mingw64-lib-mqad \
mingw64-lib-mqcertui \
mingw64-lib-mqdscli \
mingw64-lib-mqise \
mingw64-lib-mqlogmgr \
mingw64-lib-mqperf \
mingw64-lib-mqrt \
mingw64-lib-mqrtdep \
mingw64-lib-mqsec \
mingw64-lib-mqupgrd \
mingw64-lib-mqutil \
mingw64-lib-msacm32 \
mingw64-lib-msadcs \
mingw64-lib-msado15 \
mingw64-lib-msafd \
mingw64-lib-msasn1 \
mingw64-lib-mscat32 \
mingw64-lib-mscms \
mingw64-lib-msctfmonitor \
mingw64-lib-msdadiag \
mingw64-lib-msdart \
mingw64-lib-msdmo \
mingw64-lib-msdrm \
mingw64-lib-msdtclog \
mingw64-lib-msdtcprx \
mingw64-lib-msdtcstp \
mingw64-lib-msdtctm \
mingw64-lib-msdtcuiu \
mingw64-lib-msftedit \
mingw64-lib-msgina \
mingw64-lib-msgr3en \
mingw64-lib-msgrocm \
mingw64-lib-msgsvc \
mingw64-lib-mshtml \
mingw64-lib-msi \
mingw64-lib-msimg32 \
mingw64-lib-msimtf \
mingw64-lib-msir3jp \
mingw64-lib-msisip \
mingw64-lib-mslbui \
mingw64-lib-msls31 \
mingw64-lib-msmqocm \
mingw64-lib-msobdl \
mingw64-lib-msobmain \
mingw64-lib-msoe \
mingw64-lib-msoeacct \
mingw64-lib-msoert2 \
mingw64-lib-msoledbsql \
mingw64-lib-mspatcha \
mingw64-lib-msports \
mingw64-lib-msrating \
mingw64-lib-msrle32 \
mingw64-lib-mssign32 \
mingw64-lib-mssip32 \
mingw64-lib-mstask \
mingw64-lib-mstlsapi \
mingw64-lib-msutb \
mingw64-lib-msv1-0 \
mingw64-lib-msvcirt \
mingw64-lib-msvcp120-app \
mingw64-lib-msvcp60 \
mingw64-lib-msvcr100 \
mingw64-lib-msvcr110 \
mingw64-lib-msvcr120 \
mingw64-lib-msvcr120-app \
mingw64-lib-msvcr120d \
mingw64-lib-msvcr80 \
mingw64-lib-msvcr90 \
mingw64-lib-msvcr90d \
mingw64-lib-msvcrt \
mingw64-lib-msvcrt-os \
mingw64-lib-msvfw32 \
mingw64-lib-msvidc32 \
mingw64-lib-msw3prt \
mingw64-lib-mswsock \
mingw64-lib-msyuv \
mingw64-lib-mtxclu \
mingw64-lib-mtxdm \
mingw64-lib-mtxex \
mingw64-lib-mtxoci \
mingw64-lib-mydocs \
mingw64-lib-ncobjapi \
mingw64-lib-ncrypt \
mingw64-lib-ncxpnt \
mingw64-lib-nddeapi \
mingw64-lib-nddenb32 \
mingw64-lib-ndfapi \
mingw64-lib-ndis \
mingw64-lib-ndisnpp \
mingw64-lib-netapi32 \
mingw64-lib-netcfgx \
mingw64-lib-netid \
mingw64-lib-netio \
mingw64-lib-netlogon \
mingw64-lib-netman \
mingw64-lib-netoc \
mingw64-lib-netplwiz \
mingw64-lib-netrap \
mingw64-lib-netshell \
mingw64-lib-netui0 \
mingw64-lib-netui1 \
mingw64-lib-netui2 \
mingw64-lib-newdev \
mingw64-lib-nntpapi \
mingw64-lib-normaliz \
mingw64-lib-npptools \
mingw64-lib-nshipsec \
mingw64-lib-ntdll \
mingw64-lib-ntdllcrt \
mingw64-lib-ntdsapi \
mingw64-lib-ntdsbcli \
mingw64-lib-ntlanman \
mingw64-lib-ntlanui \
mingw64-lib-ntlsapi \
mingw64-lib-ntmarta \
mingw64-lib-ntmsapi \
mingw64-lib-ntoc \
mingw64-lib-ntoskrnl \
mingw64-lib-ntprint \
mingw64-lib-ntquery \
mingw64-lib-ntshrui \
mingw64-lib-ntvdm64 \
mingw64-lib-nwprovau \
mingw64-lib-oakley \
mingw64-lib-occache \
mingw64-lib-ocgen \
mingw64-lib-ocmanage \
mingw64-lib-ocmsn \
mingw64-lib-odbc32 \
mingw64-lib-odbc32gt \
mingw64-lib-odbcbcp \
mingw64-lib-odbcconf \
mingw64-lib-odbccp32 \
mingw64-lib-odbccr32 \
mingw64-lib-odbccu32 \
mingw64-lib-odbctrac \
mingw64-lib-oeimport \
mingw64-lib-oemiglib \
mingw64-lib-ole32 \
mingw64-lib-oleacc \
mingw64-lib-oleaut32 \
mingw64-lib-olecli32 \
mingw64-lib-olecnv32 \
mingw64-lib-oledb32 \
mingw64-lib-oledlg \
mingw64-lib-olesvr32 \
mingw64-lib-opends60 \
mingw64-lib-opengl32 \
mingw64-lib-osuninst \
mingw64-lib-p2p \
mingw64-lib-p2pcollab \
mingw64-lib-p2pgraph \
mingw64-lib-pathcch \
mingw64-lib-pautoenr \
mingw64-lib-pcwum \
mingw64-lib-pdh \
mingw64-lib-perfctrs \
mingw64-lib-perfdisk \
mingw64-lib-perfnet \
mingw64-lib-perfos \
mingw64-lib-perfproc \
mingw64-lib-perfts \
mingw64-lib-photowiz \
mingw64-lib-pidgen \
mingw64-lib-pintlcsd \
mingw64-lib-policman \
mingw64-lib-polstore \
mingw64-lib-portabledeviceguids \
mingw64-lib-powrprof \
mingw64-lib-printui \
mingw64-lib-prntvpt \
mingw64-lib-profmap \
mingw64-lib-propsys \
mingw64-lib-psapi \
mingw64-lib-psbase \
mingw64-lib-pschdprf \
mingw64-lib-pstorec \
mingw64-lib-pstorsvc \
mingw64-lib-qmgr \
mingw64-lib-qosname \
mingw64-lib-quartz \
mingw64-lib-query \
mingw64-lib-qutil \
mingw64-lib-qwave \
mingw64-lib-rasadhlp \
mingw64-lib-rasapi32 \
mingw64-lib-rasauto \
mingw64-lib-raschap \
mingw64-lib-rasctrs \
mingw64-lib-rasdlg \
mingw64-lib-rasman \
mingw64-lib-rasmans \
mingw64-lib-rasmontr \
mingw64-lib-rasmxs \
mingw64-lib-rasppp \
mingw64-lib-rasrad \
mingw64-lib-rassapi \
mingw64-lib-rasser \
mingw64-lib-rastapi \
mingw64-lib-rastls \
mingw64-lib-rdpcfgex \
mingw64-lib-rdpsnd \
mingw64-lib-rdpwsx \
mingw64-lib-regapi \
mingw64-lib-regsvc \
mingw64-lib-resutil \
mingw64-lib-resutils \
mingw64-lib-riched20 \
mingw64-lib-rnr20 \
mingw64-lib-routetab \
mingw64-lib-rpcdiag \
mingw64-lib-rpchttp \
mingw64-lib-rpcns4 \
mingw64-lib-rpcref \
mingw64-lib-rpcrt4 \
mingw64-lib-rpcss \
mingw64-lib-rsaenh \
mingw64-lib-rstrtmgr \
mingw64-lib-rtm \
mingw64-lib-rtutils \
mingw64-lib-runtimeobject \
mingw64-lib-samlib \
mingw64-lib-samsrv \
mingw64-lib-sapi \
mingw64-lib-scarddlg \
mingw64-lib-sccbase \
mingw64-lib-scecli \
mingw64-lib-scesrv \
mingw64-lib-schannel \
mingw64-lib-schedsvc \
mingw64-lib-sclgntfy \
mingw64-lib-scredir \
mingw64-lib-script \
mingw64-lib-scrnsave \
mingw64-lib-scrnsavw \
mingw64-lib-scrobj \
mingw64-lib-scrrun \
mingw64-lib-sdhcinst \
mingw64-lib-seclogon \
mingw64-lib-secur32 \
mingw64-lib-security \
mingw64-lib-sens \
mingw64-lib-sensapi \
mingw64-lib-senscfg \
mingw64-lib-sensorsapi \
mingw64-lib-seo \
mingw64-lib-serialui \
mingw64-lib-serwvdrv \
mingw64-lib-setupapi \
mingw64-lib-setupqry \
mingw64-lib-sfc \
mingw64-lib-sfc-os \
mingw64-lib-sfcfiles \
mingw64-lib-sfmapi \
mingw64-lib-shcore \
mingw64-lib-shdocvw \
mingw64-lib-shell32 \
mingw64-lib-shfolder \
mingw64-lib-shimeng \
mingw64-lib-shimgvw \
mingw64-lib-shlwapi \
mingw64-lib-shscrap \
mingw64-lib-shsvcs \
mingw64-lib-sigtab \
mingw64-lib-sisbkup \
mingw64-lib-skdll \
mingw64-lib-slbcsp \
mingw64-lib-slc \
mingw64-lib-slcext \
mingw64-lib-slwga \
mingw64-lib-smtpapi \
mingw64-lib-smtpctrs \
mingw64-lib-snmpapi \
mingw64-lib-snmpmib \
mingw64-lib-snprfdll \
mingw64-lib-softpub \
mingw64-lib-spoolss \
mingw64-lib-sqlsrv32 \
mingw64-lib-sqlxmlx \
mingw64-lib-srchctls \
mingw64-lib-srclient \
mingw64-lib-srrstr \
mingw64-lib-srvsvc \
mingw64-lib-ssdpapi \
mingw64-lib-ssinc \
mingw64-lib-sspicli \
mingw64-lib-staxmem \
mingw64-lib-sti \
mingw64-lib-sti-ci \
mingw64-lib-storprop \
mingw64-lib-streamci \
mingw64-lib-strmfilt \
mingw64-lib-strmiids \
mingw64-lib-svcpack \
mingw64-lib-sxs \
mingw64-lib-synceng \
mingw64-lib-synchronization \
mingw64-lib-syncui \
mingw64-lib-sysinv \
mingw64-lib-sysmod \
mingw64-lib-syssetup \
mingw64-lib-t2embed \
mingw64-lib-tapi32 \
mingw64-lib-tapiperf \
mingw64-lib-taskschd \
mingw64-lib-tbs \
mingw64-lib-tcpmib \
mingw64-lib-tdh \
mingw64-lib-traffic \
mingw64-lib-tsappcmp \
mingw64-lib-tsbyuv \
mingw64-lib-tsd32 \
mingw64-lib-tsoc \
mingw64-lib-txfw32 \
mingw64-lib-ucrt \
mingw64-lib-ucrtapp \
mingw64-lib-ucrtbase \
mingw64-lib-udhisapi \
mingw64-lib-ufat \
mingw64-lib-umandlg \
mingw64-lib-umdmxfrm \
mingw64-lib-umpnpmgr \
mingw64-lib-uniime \
mingw64-lib-unimdmat \
mingw64-lib-uniplat \
mingw64-lib-untfs \
mingw64-lib-upnp \
mingw64-lib-upnpui \
mingw64-lib-url \
mingw64-lib-urlauth \
mingw64-lib-urlmon \
mingw64-lib-usbcamd2 \
mingw64-lib-usbd \
mingw64-lib-usbport \
mingw64-lib-user32 \
mingw64-lib-userenv \
mingw64-lib-usp10 \
mingw64-lib-utildll \
mingw64-lib-uuid \
mingw64-lib-uxtheme \
mingw64-lib-vcruntime140-app \
mingw64-lib-vdsutil \
mingw64-lib-verifier \
mingw64-lib-version \
mingw64-lib-vfw32 \
mingw64-lib-vgx \
mingw64-lib-virtdisk \
mingw64-lib-vmx-mode \
mingw64-lib-vssapi \
mingw64-lib-w32time \
mingw64-lib-w32topl \
mingw64-lib-w3core \
mingw64-lib-w3ctrs \
mingw64-lib-w3dt \
mingw64-lib-w3isapi \
mingw64-lib-w3ssl \
mingw64-lib-w3tp \
mingw64-lib-wab32 \
mingw64-lib-wabimp \
mingw64-lib-wamreg \
mingw64-lib-wbemcore \
mingw64-lib-wbemupgd \
mingw64-lib-wbemuuid \
mingw64-lib-wdigest \
mingw64-lib-wdmaud \
mingw64-lib-wdsclient \
mingw64-lib-wdsclientapi \
mingw64-lib-wdscore \
mingw64-lib-wdscsl \
mingw64-lib-wdsimage \
mingw64-lib-wdstptc \
mingw64-lib-wdsupgcompl \
mingw64-lib-wdsutil \
mingw64-lib-webauthn \
mingw64-lib-webcheck \
mingw64-lib-webclnt \
mingw64-lib-webhits \
mingw64-lib-websocket \
mingw64-lib-wecapi \
mingw64-lib-wer \
mingw64-lib-wevtapi \
mingw64-lib-wevtfwd \
mingw64-lib-wiadss \
mingw64-lib-wiarpc \
mingw64-lib-wiaservc \
mingw64-lib-wiashext \
mingw64-lib-wimgapi \
mingw64-lib-windowsapp \
mingw64-lib-windowscodecs \
mingw64-lib-winfax \
mingw64-lib-winhttp \
mingw64-lib-winhvemulation \
mingw64-lib-winhvplatform \
mingw64-lib-wininet \
mingw64-lib-winipsec \
mingw64-lib-winmm \
mingw64-lib-winrnr \
mingw64-lib-winscard \
mingw64-lib-winspool \
mingw64-lib-winsrv \
mingw64-lib-winsta \
mingw64-lib-wintrust \
mingw64-lib-winusb \
mingw64-lib-wkssvc \
mingw64-lib-wlanapi \
mingw64-lib-wlanui \
mingw64-lib-wlanutil \
mingw64-lib-wldap32 \
mingw64-lib-wlnotify \
mingw64-lib-wlstore \
mingw64-lib-wmcodecdspuuid \
mingw64-lib-wmi \
mingw64-lib-wmi2xml \
mingw64-lib-wmiaprpl \
mingw64-lib-wmilib \
mingw64-lib-wmiprop \
mingw64-lib-wmisvc \
mingw64-lib-wofutil \
mingw64-lib-wow64 \
mingw64-lib-wow64cpu \
mingw64-lib-wow64mib \
mingw64-lib-wow64win \
mingw64-lib-wpd-ci \
mingw64-lib-ws2-32 \
mingw64-lib-ws2help \
mingw64-lib-wscapi \
mingw64-lib-wscsvc \
mingw64-lib-wsdapi \
mingw64-lib-wshatm \
mingw64-lib-wshbth \
mingw64-lib-wslapi \
mingw64-lib-wsock32 \
mingw64-lib-wtsapi32 \
mingw64-lib-x3daudio \
mingw64-lib-x3daudio1-2 \
mingw64-lib-x3daudio1-3 \
mingw64-lib-x3daudio1-4 \
mingw64-lib-x3daudio1-5 \
mingw64-lib-x3daudio1-6 \
mingw64-lib-x3daudio1-7 \
mingw64-lib-x3daudiod1-7 \
mingw64-lib-xapofx \
mingw64-lib-xapofx1-0 \
mingw64-lib-xapofx1-1 \
mingw64-lib-xapofx1-2 \
mingw64-lib-xapofx1-3 \
mingw64-lib-xapofx1-4 \
mingw64-lib-xapofx1-5 \
mingw64-lib-xapofxd1-5 \
mingw64-lib-xaudio2-8 \
mingw64-lib-xinput \
mingw64-lib-xinput1-1 \
mingw64-lib-xinput1-2 \
mingw64-lib-xinput1-3 \
mingw64-lib-xinput1-4 \
mingw64-lib-xinput9-1-0 \
mingw64-lib-zoneoc \
mingw64-runtime"

RDEPENDS:${PN} += "mingw64-headers"

inherit rpm
