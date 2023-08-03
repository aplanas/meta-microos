SUMMARY = "Firmware data files for SOF Drivers"
DESCRIPTION = "Firmware data files for Sound Open Firmware (SOF) drivers."
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "sof-firmware-2.2.6-1.1.noarch.rpm"
RPM_HASH = "d1f56cee91238d2bb006a2e07e2caf0e598b18f65eb66fc6f25252a5f1f664ae9586c870857e1bc0c3267c2c7997565398050683e5ffbdf8137898db1964f140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-intel/sof-tplg-v2.2.6/sof-acp.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-cs35l41.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-ssp1-hdmi-ssp02.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-es8336.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682-2way.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682-waves-2way.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682-waves.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98357a-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-nau8825.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-rt5682-2way.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-rt5682-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-rt5682-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-rt5682-waves.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98360a-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98373-nau8825-dts.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98373-nau8825.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98390-rt5682-google-aec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98390-rt5682-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98390-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-max98390-ssp2-rt5682-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-nau8825.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-nocodec-ci.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-nocodec-hdmi-ssp02.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1015-nau8825.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1019-nau8825.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1019-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1316-l1-mono-rt714-l0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1316-l12-rt714-l0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1316-l2-mono-rt714-l0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt1316-l2-mono-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1308-l12-rt715-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1316-l12-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1316-l13-rt714-l2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1316-l2-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1316-l2-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l0-rt1316-l3-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l2-rt1316-l01-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711-l2-rt1316-l01.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-rt711.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-adl-sdw-max98373-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-da7219.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-demux-pcm512x.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic2ch-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-dmic4ch-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-es8336.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-keyword-detect.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-nocodec-ci.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-pcm512x-master-44100.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-pcm512x-master.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-pcm512x.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-rt298.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-tdf8532.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-apl-wm8804.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-bdw-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-bdw-rt286.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-bdw-rt5640.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-bdw-rt5677.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-cx2072x-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-cx2072x.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-da7213-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-da7213.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-es8316-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-es8316.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-max98090.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5640-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5640.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5645-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5645.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5651-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5651.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5670-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5670.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5682-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-byt-wm5102-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-cx2072x.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-da7213.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-es8316.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-max98090.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-nau8824.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-rt5640.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-rt5645.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-rt5651.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-rt5670.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cht-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-da7219-max98357a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-da7219-max98390.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-demux-rt5682-max98357a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-demux-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt1011-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt5682-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt5682-max98357a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt700-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt700-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt700.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt711-rt1308-mono-rt715.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cml-rt711-rt1308-rt715.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cnl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-cnl-rt274.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-ehl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-ehl-rt5660-nohdmi.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-ehl-rt5660.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-cs42l42.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-da7219-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-da7219.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic2ch-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-dmic4ch-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336-ssp5.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-es8336.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-glk-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-1ch-pdm1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-1ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-2ch-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-2ch-pdm1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-3ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-4ch-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-idisp-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-idisp-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic-idisp.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-hda-generic.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-dmic-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt5682-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt700-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt700-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt700.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-icl-rt711-rt1308-rt715.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-compr-wm8960-mixer.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-cs42888-mixer.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-cs42888.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-drc-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-eq-fir-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-eq-iir-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-nocodec-sai.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-wm8960-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-wm8960-mixer.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-compr-wm8960-mixer.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-drc-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-eq-fir-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-eq-iir-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-wm8904.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-wm8960-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-wm8960-mixer.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8mp-wm8960.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8ulp-9x9-btsco.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-imx8ulp-btsco.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-cs42l42-mx98360a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-da7219-mx98360a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-da7219.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-rt5682-mx98360a.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-rt5682-rt1015-xperi.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-rt5682-rt1015.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-jsl-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8186-mt6366-da7219-max98357.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8186-mt6366-rt1019-rt5682s.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8195-mt6359-max98390-rt5682-google-aec-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8195-mt6359-max98390-rt5682-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8195-mt6359-max98390-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8195-mt6359-rt1019-rt5682-dts.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-mt8195-mt6359-rt1019-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rn-rt5682-max98360.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rn-rt5682-rt1019.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt1316-l12-rt714-l0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l0-rt1316-l12-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l0-rt1318-l12-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l0-rt1318-l12.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l2-rt1316-l01-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l2-rt1316-l01.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711-l2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-rpl-rt711.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-smart-amplifier-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic2ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic2ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic2ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic4ch-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic4ch-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-dmic4ch-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-ssp0.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-ssp1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-es8336.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-h-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98357a-rt5682-pdm1-drceq.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98357a-rt5682-pdm1-google-aec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98357a-rt5682-pdm1.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98357a-rt5682-rtnr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98357a-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98373-rt5682-igonr.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98373-rt5682-xperi.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-max98373-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-nocodec-ci.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-nocodec-hdmi-ssp15.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-nocodec.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt1011-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt1308-ssp2-hdmi-ssp15.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt5682-ssp0-max98373-ssp2-xperi.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt5682-ssp0-max98373-ssp2.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-l0-rt1316-l1-mono-rt714-l3.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-rt1308-2ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-rt1308-4ch.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-rt1308-mono-rt715.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-rt1308-rt715.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt711-rt1316-rt714.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-rt715-rt711-rt1308-mono.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-tgl-sdw-max98373-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-whl-demux-rt5682.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-whl-rt5682-kwd.tplg \
firmware-intel/sof-tplg-v2.2.6/sof-whl-rt5682.tplg \
firmware-intel/sof/community/sof-adl-n.ri \
firmware-intel/sof/community/sof-adl-s.ri \
firmware-intel/sof/community/sof-adl.ri \
firmware-intel/sof/community/sof-apl.ri \
firmware-intel/sof/community/sof-cfl.ri \
firmware-intel/sof/community/sof-cml.ri \
firmware-intel/sof/community/sof-cnl.ri \
firmware-intel/sof/community/sof-ehl.ri \
firmware-intel/sof/community/sof-glk.ri \
firmware-intel/sof/community/sof-icl.ri \
firmware-intel/sof/community/sof-jsl.ri \
firmware-intel/sof/community/sof-rpl-s.ri \
firmware-intel/sof/community/sof-rpl.ri \
firmware-intel/sof/community/sof-tgl-h.ri \
firmware-intel/sof/community/sof-tgl.ri \
firmware-intel/sof/intel-signed/sof-adl-n.ri \
firmware-intel/sof/intel-signed/sof-adl-s.ri \
firmware-intel/sof/intel-signed/sof-adl.ri \
firmware-intel/sof/intel-signed/sof-apl.ri \
firmware-intel/sof/intel-signed/sof-cfl.ri \
firmware-intel/sof/intel-signed/sof-cml.ri \
firmware-intel/sof/intel-signed/sof-cnl.ri \
firmware-intel/sof/intel-signed/sof-ehl.ri \
firmware-intel/sof/intel-signed/sof-glk.ri \
firmware-intel/sof/intel-signed/sof-icl.ri \
firmware-intel/sof/intel-signed/sof-jsl.ri \
firmware-intel/sof/intel-signed/sof-rpl-s.ri \
firmware-intel/sof/intel-signed/sof-rpl.ri \
firmware-intel/sof/intel-signed/sof-tgl-h.ri \
firmware-intel/sof/intel-signed/sof-tgl.ri \
firmware-intel/sof/sof-adl-n.ldc \
firmware-intel/sof/sof-adl-n.ri \
firmware-intel/sof/sof-adl-s.ldc \
firmware-intel/sof/sof-adl-s.ri \
firmware-intel/sof/sof-adl.ldc \
firmware-intel/sof/sof-adl.ri \
firmware-intel/sof/sof-apl.ldc \
firmware-intel/sof/sof-apl.ri \
firmware-intel/sof/sof-bdw.ldc \
firmware-intel/sof/sof-bdw.ri \
firmware-intel/sof/sof-byt.ldc \
firmware-intel/sof/sof-byt.ri \
firmware-intel/sof/sof-cfl.ldc \
firmware-intel/sof/sof-cfl.ri \
firmware-intel/sof/sof-cht.ldc \
firmware-intel/sof/sof-cht.ri \
firmware-intel/sof/sof-cml.ldc \
firmware-intel/sof/sof-cml.ri \
firmware-intel/sof/sof-cnl.ldc \
firmware-intel/sof/sof-cnl.ri \
firmware-intel/sof/sof-ehl.ldc \
firmware-intel/sof/sof-ehl.ri \
firmware-intel/sof/sof-glk.ldc \
firmware-intel/sof/sof-glk.ri \
firmware-intel/sof/sof-icl.ldc \
firmware-intel/sof/sof-icl.ri \
firmware-intel/sof/sof-jsl.ldc \
firmware-intel/sof/sof-jsl.ri \
firmware-intel/sof/sof-rpl-s.ldc \
firmware-intel/sof/sof-rpl-s.ri \
firmware-intel/sof/sof-rpl.ldc \
firmware-intel/sof/sof-rpl.ri \
firmware-intel/sof/sof-tgl-h.ldc \
firmware-intel/sof/sof-tgl-h.ri \
firmware-intel/sof/sof-tgl.ldc \
firmware-intel/sof/sof-tgl.ri \
sof-firmware"

RDEPENDS:${PN} += ""

inherit rpm
